package br.edu.unifeg.orçamento;

import javax.persistence.Entity;
import javax.persistance.Id
import javax.persistence.GenerationType;

@Entity;
public class tipo.produto {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
  private long id; //PK = LONG
  
  private String codigo;
  private String tipoProduto;

  public Long getId() {return this.id; }

  public String getCodigo () {return this.codigo;}
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public String getTipoProduto() {
    return this.TipoProduto;
  }
  public void setTipoProdut(String tipoProdut){
    this.tipoProduto = tipoProduto;
  }

}
