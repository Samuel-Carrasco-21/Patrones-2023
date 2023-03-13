package adapter.practice;

public class Main {
    public static void main(String[] args) {
        Android android = new Android("A51");
        android.login();
        android.logout();
        android.reportes();
        android.infoMob();

        Escritorio escritorio = new Escritorio("Discord");
        escritorio.iniciarSesion();
        escritorio.cerrarSesion();
        escritorio.generarDatos();
        escritorio.infoComp();

        MobileAdapter mobileAdapter = new MobileAdapter(android);
        mobileAdapter.iniciarSesion();
        mobileAdapter.cerrarSesion();
        mobileAdapter.generarDatos();
    }
}
