/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.channelfw.testsuite.chaincoherency;

import com.ibm.wsspi.channelfw.exception.InvalidChannelFactoryException;
import com.ibm.wsspi.tcpchannel.TCPConnectRequestContext;

/**
 * Test factory for tcp-in int-out.
 */
public class TcpAddrInIntAddrOutFactory extends ConnectorChannelFactory {
    /**
     * Constructor.
     * 
     * @throws InvalidChannelFactoryException
     */
    public TcpAddrInIntAddrOutFactory() throws InvalidChannelFactoryException {
        super();
        devAddr = TCPConnectRequestContext.class;
        appAddrs = new Class[] { Integer.class };
    }

}