"""
/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
    This is a Python script for sorting ifcElement
    with it's stepNumber.

    @author : stan
    @date   : 2022/12/11

    params:
        - file:     unsorted ifc file
        - outfile   sorted ifc file
"""

import re
import argparse
from tqdm import trange

def read_ifc(ifc_file: str) -> tuple:

    with open(ifc_file) as f:
        data = f.read()

    items = data.split("ENDSEC;")

    return items


def extract_step_number(step_element: str) -> int:
    extract = re.findall(r"#(.+?)=", step_element)

    return int(extract[0])


def sort_element(body: list) -> list:

    temp = []
    elements = body.split(";\n")

    for element in trange(len(elements),desc='processing token'):

        token = elements[element]

        if token == "":
            continue

        processed = token.replace("\n","") + ";\n"
        temp.append(processed)

    temp_sort = {}

    data_item = temp[1:]

    for item in trange(len(data_item), desc='sorting ifc file'):
        stepNumber = extract_step_number(data_item[item])
        temp_sort[stepNumber] = data_item[item]

    result = sorted(temp_sort.items())
    result = [i[1] for i in result]

    final = [temp[0]]
    final.extend(result)

    return final

def save_ifc(data, body, out_path):
    data[1] = "".join(body)
    whole = "ENDSEC;".join(data)

    with open(out_path, mode="w") as f:
        f.write(whole)

def parse_args():
    parser = argparse.ArgumentParser(description="Ifc sorter. A simple tool for sorting Ifc step number ascendingly")
    parser.add_argument("--input", "-i", type=str, help="path to input file")

    group = parser.add_mutually_exclusive_group()
    group.add_argument("--output", "-o", type=str, help="path to output file")
    group.add_argument("--replace", "-r", action='store_true')

    args = parser.parse_args()

    data = read_ifc(args.input)
    sort_result = sort_element(data[1])

    if args.replace:
        save_ifc(data, sort_result, args.input)
    else:
        save_ifc(data, sort_result, args.output)

if __name__ == '__main__':
    parse_args()
