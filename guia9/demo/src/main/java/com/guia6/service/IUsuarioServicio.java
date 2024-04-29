import com.guia7.model.Usuario;

public interface IUsuarioServicio {
    public List<Usuario> listaUsuarios();

    public void guardar(Usuario user);

    public void eliminar(Usuario user);

    public Usuario buscar(Usuario user);
}
