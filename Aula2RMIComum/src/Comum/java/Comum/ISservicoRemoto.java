package Comum;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ISservicoRemoto  extends Remote{
    void inserir (Pessoa p) throws RemoteException;
    List<Pessoa> listarPessoa() throws RemoteException;
}