/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgimplements;

/**
 *
 * @author hp
 */
interface Car {
  public void engineSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

abstract class Job{
    public abstract String jobName();
}

class Mercedez implements Car {
    
  @Override
  public void engineSound() {
    // The body of engineSound() is provided here
    System.out.println("Brummmm....");
  }
  @Override
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}
class Person extends Job{
    String jobName;
  @Override
    public String jobName() {
       return jobName; 
    }
    
}