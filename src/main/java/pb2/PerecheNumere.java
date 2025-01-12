package pb2;


public class PerecheNumere {
    public int x;
    public int y;

    public PerecheNumere() {}

    public PerecheNumere(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x=x;
    }

    public void setY(int y)
    {
        this.y=y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public boolean Fibonacci(int a, int b) {
        if((x == a && y == b) || (y == a && x == b)) {
            return true;
        }
        if(x < b || y < b) {
            return false;
        }
        return this.Fibonacci(b, a+b);
    }

    public int cmmmc() {
        int a = x, b = y;
        while(a != b) {
            if(a > b)
                a=a-b;
            else
                b=b-a;
        }
        int cmmdc = a;
        return x*y/cmmdc;
    }

    public boolean sumaCifrelorEgala(){
        int a = x, b = y;
        int sumaa = 0, sumab = 0;
        while(a != 0){
            sumaa += a%10;
            a/=10;
        }
        while(b != 0) {
            sumab += b%10;
            b/=10;
        }
        return sumaa == sumab;
    }

    public boolean acelasiNrCifrePare() {
        int a = x, b = y;
        int nra = 0, nrb = 0;
        while(a != 0){
            if(a%2 == 0)
                nra++;
            a=a/10;
        }
        while(b != 0) {
            if(b%2 == 0)
                nrb++;
            b=b/10;
        }
        return nra == nrb;
    }
}