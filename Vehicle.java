class Vehicle{
    String make;
    String model;
    int manufactured;
  
    public String toString(){
      return "This " + this.make +
               " " + this.model +
              " was made in the year " + this.manufactured;
    }
    public Vehicle (String make, String model, int manufactured) {
    this.make = make;
    this.model = model;
    this.manufactured = manufactured;
    }
    
    public Vehicle (String make, String model) {
      this.make = make;
      this.model = model;
      this.manufactured = manufactured;
    }

    public Vehicle (String make) {
      this.make = make;
      this.model = model;
      this.manufactured = manufactured;
    }
  }