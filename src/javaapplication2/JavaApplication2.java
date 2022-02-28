/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author matteopersonnettaz
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
String serverAddress;
        serverAddress="casaroby.dlinkddns.com";
        int serverPort=13;
        byte buffer[] = new byte[512];
       
            DatagramPacket outPacket = new DatagramPacket("".getBytes(), 0, InetAddress.getByName(serverAddress), serverPort);
            DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);
            DatagramSocket dSocket = new DatagramSocket();

            dSocket.send(outPacket);
            dSocket.receive(inPacket);
            System.out.println("Pacchetto ricevuto: "+new String(buffer,0,inPacket.getLength()));    }
    
}
