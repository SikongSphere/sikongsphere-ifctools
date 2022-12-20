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
"""

"""
This is a Python script for sorting ifcElement
with it's stepNumber.

@author : stan
@date   : 2022/12/11

params:
    - file:     unsorted ifc file
    - outfile   sorted ifc file
"""

import re

file = "../../../test/resources/steel/171210AISC_Sculpture_brep.ifc"
outfile = "../../../test/resources/steel/171210AISC_Sculpture_brep.ifc"

def read_ifc(ifc_file: str) -> tuple:
    with open(ifc_file) as f:
        data = f.readlines()

    start = data.index("DATA;\n")
    end = data.index("ENDSEC;\n", start)

    body = data[start + 1: end]

    return data, start, end, body


def extract_step_number(step_element: str) -> int:
    extract = re.findall(r"#(.+?)=", step_element)

    return int(extract[0])


def sort_element(body: list) -> list:
    temp = {}

    for item in body:
        stepNumber = extract_step_number(item)
        temp[stepNumber] = item

    result = sorted(temp.items())
    result = [i[1] for i in result]

    return result


def save_ifc(data, start, end, body):
    data[start + 1: end] = body

    with open(outfile, mode="w") as f:
        f.writelines(data)


if __name__ == '__main__':
    data, start, end, body = read_ifc(file)
    result = sort_element(body)
    save_ifc(data=data, start=start, end=end, body=result)
