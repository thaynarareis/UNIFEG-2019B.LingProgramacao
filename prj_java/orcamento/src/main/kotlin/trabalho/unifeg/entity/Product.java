package br.edu.unifeg.orçamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax persistence.Id;

@Entity

public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

PRIVATE integer Id;
  private String code;
  private String name;
  private double price;
  private int    qtdStock;

  public void setCode(String code){
    this.code = code;
  }
  public String getCode(){
    return this.code;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public double getPrice(){
    return this.price;
  }
  public void setQtdStock(int qtdStock){
    this.qtdStock = qtdStock;
  }
  public int getQtdStock(){
    return this.QtdStock;
  }
  public Integer getId(){
    return Id;
  }
  public void setId(Integer id){
    this.id = id;
  }
}
