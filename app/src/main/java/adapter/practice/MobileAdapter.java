package adapter.practice;

public class MobileAdapter implements IComputadora{
    private IMobile iMobile;

    public MobileAdapter(IMobile mobileAdapter){
        this.iMobile = mobileAdapter;
    }

    @Override
    public void iniciarSesion() {
        iMobile.login();
    }

    @Override
    public void cerrarSesion() {
        iMobile.logout();
    }

    @Override
    public void generarDatos() {
        iMobile.reportes();
    }

    @Override
    public void infoComp() {
        iMobile.infoMob();
    }
    
}
