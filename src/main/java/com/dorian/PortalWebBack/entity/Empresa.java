package com.dorian.PortalWebBack.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public String nombreDeEmpresa;
	
    public String locacion;
    
    public long RUC;
    
    public String sitioWeb;
    
    public String descripcion;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    public Usuario usuario;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_oferta_empresa", referencedColumnName = "id")
    public OfertaEmpresa ofertaEmpresa;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pago_empresa", referencedColumnName = "id")
    public PagoEmpresa pagoEmpresa;

	public Empresa(String nombreDeEmpresa, String locacion, long rUC, String sitioWeb, String descripcion) {
		this.nombreDeEmpresa = nombreDeEmpresa;
		this.locacion = locacion;
		this.RUC = rUC;
		this.sitioWeb = sitioWeb;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreDeEmpresa() {
		return nombreDeEmpresa;
	}

	public void setNombreDeEmpresa(String nombreDeEmpresa) {
		this.nombreDeEmpresa = nombreDeEmpresa;
	}

	public String getLocacion() {
		return locacion;
	}

	public void setLocacion(String locacion) {
		this.locacion = locacion;
	}

	public long getRUC() {
		return RUC;
	}

	public void setRUC(long rUC) {
		this.RUC = rUC;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public OfertaEmpresa getOfertaEmpresa() {
		return ofertaEmpresa;
	}

	public void setOfertaEmpresa(OfertaEmpresa ofertaEmpresa) {
		this.ofertaEmpresa = ofertaEmpresa;
	}

	public PagoEmpresa getPagoEmpresa() {
		return pagoEmpresa;
	}

	public void setPagoEmpresa(PagoEmpresa pagoEmpresa) {
		this.pagoEmpresa = pagoEmpresa;
	}
    
}