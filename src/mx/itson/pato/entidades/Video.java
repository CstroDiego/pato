package mx.itson.pato.entidades;

import java.util.Date;
import java.util.List;

public class Video {
    private String titulo;
    private String descripcion;
    private Date fecha;
    private Usuario usuario;
    private List<Comentario> comentarios;
}
