package org.sikongsphere.ifc.serialization;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.sikongsphere.ifc.common.enumeration.IsoTagEnum;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

public class IfcFileModelSerializer extends Serializer<IfcFileModel> {
    @Override
    public void write(Kryo kryo, Output output, IfcFileModel ifcFileModel) {
        // iso tag
        output.writeInt(IsoTagEnum.indexOf(ifcFileModel.isoTagEnum));
        // header
        ifcFileModel.getHeader().getFileDescription();
        // body
    }

    @Override
    public IfcFileModel read(Kryo kryo, Input input, Class<IfcFileModel> aClass) {
        return null;
    }
}
