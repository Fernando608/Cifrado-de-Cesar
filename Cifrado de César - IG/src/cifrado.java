
import javax.swing.JOptionPane;

public class cifrado {
    
    private int clave;
    private String mensaje;
     
    public cifrado(){
         clave = 0;
         mensaje = " ";
    }
    
    public int getClave() {
        return clave;
    }

    
    public void setClave(int clave) {
        this.clave = clave;
    }
 
    public String getMensaje() {
        return mensaje;
    }
 
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
     
      public String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        mensaje = texto;
        clave = codigo;
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
   
       public  String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        mensaje = texto;
        clave = codigo;
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
}
