/*
 This file is part of the OdinMS Maple Story Server
 Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc> 
 Matthias Butz <matze@odinms.de>
 Jan Christian Meyer <vimes@odinms.de>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License version 3
 as published by the Free Software Foundation. You may not use, modify
 or distribute this program under any other version of the
 GNU Affero General Public License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.odinms.net.world.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import net.sf.odinms.net.channel.ChannelDescriptor;
import net.sf.odinms.net.channel.remote.ChannelWorldInterface;
import net.sf.odinms.net.login.remote.LoginWorldInterface;

/**
 * Channel Login 对 World 注册操作
 *
 * @author Matze
 */
public interface WorldRegistry extends Remote {

	public WorldChannelInterface registerChannelServer(String authKey,
			ChannelWorldInterface cb) throws RemoteException;

	public void deregisterChannelServer(ChannelDescriptor channelDescriptor)
			throws RemoteException;

	public WorldLoginInterface registerLoginServer(String authKey,
			LoginWorldInterface cb) throws RemoteException;

	public void deregisterLoginServer(LoginWorldInterface cb)
			throws RemoteException;
}
