package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {

    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");

  }

  public int getActualFuel() {
    return this.actualFuel;

  }

  public void setActualFuel(int i) {
    if (i >= 0) {
      actualFuel = i;
    }else {
      System.out.println("No puedes tener comvustible negativo");
    }
  }
}
