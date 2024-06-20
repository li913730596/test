package org.example;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {
    public static void main(String[] args) {
        try {
            TTransport transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            UserService.Client client = new UserService.Client(protocol);

            // 保存用户
            User user = new User(1, "Bob", "bob@example.com");
            client.saveUser(user);
            System.out.println("User saved.");

            // 获取用户
            User fetchedUser = client.getUserById(1);
            System.out.println("Fetched user: " + fetchedUser);

            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

