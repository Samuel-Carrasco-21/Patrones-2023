package observer.practice;

public class Main {
    public static void main(String[] args) {
        PropagandaPersonal personal = new PropagandaPersonal();
        personal.setNombre("Telefonia ENTEL");

        Usuario u1 = new Usuario("Ignacio", 1001);
        Usuario u2 = new Usuario("Pablo", 2001);
        Usuario u3 = new Usuario("Brandon", 3001);
        Usuario u4 = new Usuario("Andres", 4001);
        Usuario u5 = new Usuario("Alan", 5001);
        Usuario u6 = new Usuario("Pedro", 6001);
        Usuario u7 = new Usuario("Maria", 7001);
        Usuario u8 = new Usuario("Eynar", 8001);

        personal
        .agregarUsuario(u1, "premios");
        personal
        .agregarUsuario(u1, "promosiones");

        personal
        .agregarUsuario(u2, "promosiones");

        personal
        .agregarUsuario(u3, "noticia");

        personal
        .agregarUsuario(u4, "precios llamadas");
        personal
        .agregarUsuario(u4, "promosiones");
        personal
        .agregarUsuario(u4, "premios");
        personal
        .agregarUsuario(u4, "noticia");

        personal
        .agregarUsuario(u5, "noticia");
        personal
        .agregarUsuario(u5, "premios");

        personal
        .agregarUsuario(u6, "premios");
        personal
        .agregarUsuario(u6, "promosiones");

        personal
        .agregarUsuario(u7, "noticia");
        
        personal
        .agregarUsuario(u8, "precios llamadas");
        personal
        .agregarUsuario(u8, "promosiones");
        personal
        .agregarUsuario(u8, "premios");
        personal
        .agregarUsuario(u8, "noticia");

        personal.enviarOferta(
            new Notificacion("30840", "premios"));
        System.out.println("==================================");
        personal.enviarOferta(
            new Notificacion("40840", "noticia"));
        System.out.println("==================================");
        personal.enviarOferta(
            new Notificacion("50840", "promosiones"));
        System.out.println("==================================");
        personal.enviarOferta(
            new Notificacion("60840", "precios llamadas"));
    }
}
