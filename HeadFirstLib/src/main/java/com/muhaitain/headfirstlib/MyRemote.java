package com.muhaitain.headfirstlib;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
