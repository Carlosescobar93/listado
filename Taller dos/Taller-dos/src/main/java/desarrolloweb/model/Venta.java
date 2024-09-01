package desarrolloweb.model;

import java.util.Date;

public class Venta {
    private Long id;
    private Integer valor;
    private Date fecha;
    private String vendedor;
    private String zona;
    private String token;

    public Venta() {

    }

    public Venta(Long id, Integer valor, Date fecha, String vendedor, String zona, String token) {
        this.id = id;
        this.valor = valor;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.zona = zona;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
