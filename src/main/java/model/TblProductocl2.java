package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProductoCL2;

	private String descripCL2;

	private String estadoCL2;

	private String nombreCL2;

	private double precioCompCL2;

	private double precioVentaCL2;

	public TblProductocl2() {
	}

	public int getIdProductoCL2() {
		return this.idProductoCL2;
	}

	public void setIdProductoCL2(int idProductoCL2) {
		this.idProductoCL2 = idProductoCL2;
	}

	public String getDescripCL2() {
		return this.descripCL2;
	}

	public void setDescripCL2(String descripCL2) {
		this.descripCL2 = descripCL2;
	}

	public String getEstadoCL2() {
		return this.estadoCL2;
	}

	public void setEstadoCL2(String estadoCL2) {
		this.estadoCL2 = estadoCL2;
	}

	public String getNombreCL2() {
		return this.nombreCL2;
	}

	public void setNombreCL2(String nombreCL2) {
		this.nombreCL2 = nombreCL2;
	}

	public double getPrecioCompCL2() {
		return this.precioCompCL2;
	}

	public void setPrecioCompCL2(double precioCompCL2) {
		this.precioCompCL2 = precioCompCL2;
	}

	public double getPrecioVentaCL2() {
		return this.precioVentaCL2;
	}

	public void setPrecioVentaCL2(double precioVentaCL2) {
		this.precioVentaCL2 = precioVentaCL2;
	}

}