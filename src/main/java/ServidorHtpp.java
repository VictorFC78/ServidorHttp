import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorHtpp {
    private static final int PUERTO=8000;
    public ServidorHtpp(){
        try {
            ServerSocket servidor=new ServerSocket(PUERTO);
            while(true){
                System.out.println("Esperando cliente...");
                Socket cliente = servidor.accept();
                System.out.println("Nuevo cliente conectado");
                HiloCliente hiloCliente=new HiloCliente(cliente);
                hiloCliente.start();
            }
        } catch (IOException e) {
            System.out.println("Error al iniciar el servidor");
        }

    }
}
