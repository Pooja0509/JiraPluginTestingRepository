import javax.ejb.*;
import java.rmi.RemoteException;

public class MyClass implements SessionBean {

    
    
    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
        try{
            int a=10, b=0, c=0;
            c=(a/b);
            System.out.println("Value:" + c);
             System.out.println("Value:" + c);
            System.out.println("Value:" + c);
            System.out.println("Value:" + c);
            System.out.println("Value:" + c);
            System.out.println("Value:" + c);
            System.out.println("Value:" + c);
        } catch(Exception e){
        
        }
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {

    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {

    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {

    }
}
