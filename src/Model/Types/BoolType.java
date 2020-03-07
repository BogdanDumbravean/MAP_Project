package Model.Types;

import Model.Values.BoolValue;
import Model.Values.Value;
//import com.sun.org.apache.xpath.internal.operations.Bool;

public class BoolType implements Type {
    @Override
    public boolean equals(Object another){
        return another instanceof BoolType;
    }

    @Override
    public String toString() { return "bool";}

    @Override
    public Value defaultValue() {
        return new BoolValue(true);
    }
}
