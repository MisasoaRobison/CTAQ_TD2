package org.example;

public class Gav {
  private String group;
  private String artefact;
  private String version;

  public Gav(String group, String artefact, String version){
    this.group = group;
    this.artefact = artefact;
    this.version = version;
  }

  public static Gav parse(String input){
    String[] splits = input.split(":");
    return new Gav(splits[0], splits[1], splits[2]);
  }

  public String group(){
    //Question td2_q05_green => return "org.acme"; //on renvoie ici une valeur codée en dur

    return group;
  }

  public String artefact(){
    return artefact;
  }

  public String version(){
    return version;
  }
}