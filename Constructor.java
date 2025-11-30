public class Main {
    String modelName;
    int modelyear;
    
    public Main (String modelName) {
        this(modelName,2023);
        
    }
    
    public Main (String modelName,int modelyear) {
        this.modelName=modelName;
        this.modelyear=modelyear;
    }
    
    public void printInfo() {
        System.out.println(modelName+" "+modelyear);
        }
        
        public static void main(String[] args){
            Main Car1 = new Main("Rolls Royce");
            Main Car2 = new Main("Ford",2028);
            
            Car1.printInfo();
            Car2.printInfo();
            
        }
        
    }