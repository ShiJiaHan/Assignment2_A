
/**
 * Assignment2_A
 *
 * @Shi Jia Han
 * @Sept.30
 */
public class Calculator
{
    double cox2=1;//coefficient of x^2
    double cox=5; //coefficient of x
    double con=6;//constant
    
    int x1st=0;//x coordinnate of the first point
    int y1st=0;//y coordinnate of the first point
    int x2nd=2;//x coordinnate of the second point
    int y2nd=3;//y coordinnate of the second point
    
    int geo1=3;//first term of geometric sequence
    int georate=2;//common ratio
    int geoterm=3;//number of terms
    
    int ari1=1;//first term of arithmatic sequence
    int arirate=1;//common difference
    int ariterm=5;//number of terms
    
    public double QuadraticFormulaPlus (double a, double b, double c){
        //a is the coefficient of x^2
        //b is the coefficient of x
        //c is the costant
        double QuaSol1=(-b+Math.sqrt(Math.pow(b,2)-4*c))/2*a;
        return QuaSol1;
    }
    
    public double QuadraticFormulaMinus (double a, double b, double c){
        //a is the coefficient of x^2
        //b is the coefficient of x
        //c is the costant
        double QuaSol2=(-b-Math.sqrt(Math.pow(b,2)-4*c))/2*a;
        return QuaSol2;
    }
    
    public double SlopeFormula (double x1,double y1,double x2, double y2){
        //x1 is the x coordinnate of the first point
        //x2 is the x coordinnate of the second point
        //y1 is the y coordinnate of the first point
        //y2 is the y coordinnate of the second point
        double slope=(y2-y1)/(x2-x1);
        
        return slope;
    }
    
    public String MidpointFormula (double x1,double y1,double x2, double y2){
        //x1 is the x coordinnate of the first point
        //x2 is the x coordinnate of the second point
        //y1 is the y coordinnate of the first point
        //y2 is the y coordinnate of the second point
        double midx=(x1+x2)/2;
        double midy=(y1+y2)/2;
        String midpoint="("+Double.toString(midx)+","+Double.toString(midy)+")";
        
        return midpoint;
        
    }
    
    public double ArithmaticSequence (double a1,double c,double i ){
        //a1 is the first term of the arithmatic sequence
        //c is the common difference
        //i is the number of terms
        double ariSum=(a1+(a1+c*(i-1)))*i/2;
        
        return ariSum;
    }
    
    public double GeometricSequence (double g1, double r, double i){
        //g1 is the first term of the geometric sequence
        //r is the common ratio
        //i is the number of terms
        double geoSum=g1*((1-Math.pow(r,i))/(1-r));
        
        return geoSum;
    }
    
    public void display(){
    System.out.println("The solutions for "+cox2+"x^2+"+cox+"x+"+con+" are "+QuadraticFormulaPlus(cox2,cox,con)+" and "+QuadraticFormulaMinus(cox2,cox,con));
    System.out.println("The line connecting the points ("+x1st+","+y1st+") and ("+x2nd+","+y2nd+") has a slope of "+SlopeFormula(x1st,y1st,x2nd,y2nd));
    System.out.println("The midpoint between ("+x1st+","+y1st+") and ("+x2nd+","+y2nd+") is "+MidpointFormula(x1st,y1st,x2nd,y2nd));
    System.out.println("The sum of the first "+ariterm+" terms of an arithmetic series that starts with "+ari1+" and increases by "+arirate+" is "+ArithmaticSequence(ari1,arirate,ariterm));
    System.out.println("The sum of the first "+geoterm+" terms of a finite geometric series that starts with "+geo1+" and increases by a rate of "+georate+" is "+GeometricSequence(geo1,georate,geoterm));
    
    }
}
