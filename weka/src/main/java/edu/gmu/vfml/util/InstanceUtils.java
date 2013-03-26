package edu.gmu.vfml.util;

import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

public class InstanceUtils
{
    public static Attribute[] getAttributes( Instances instances )
    {
        return getAttributes( instances.instance( 0 ) );
    }
    
    public static Attribute[] getAttributes( Instance instance )
    {
        int numAttributes = instance.numAttributes( );
        Attribute[] attributes = new Attribute[ numAttributes ];
    
        for ( int i = 0 ; i < numAttributes ; i++ )
        {
            attributes[i] = instance.attribute( i );
        }
        
        return attributes;
    }
}
