/*******************************************************************************
* Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
* which accompanies this distribution.
* The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
* and the Eclipse Distribution License is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* Contributors:
*     bdoughan - March 11/2010 - 2.0.2 - Initial implementation
******************************************************************************/
package org.eclipse.persistence.testing.oxm.mappings.compositecollection.norefclass;

public class Address {

    public boolean equals(Object o) {
        if(null == o) {
            return false;
        }
        return o.getClass() == Address.class;
    }

}
