public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            if(isStart()){
                System.out.println("*****************" + f1.name + " BASLIYOR" + "*****************");
            }else{
                System.out.println("*****************" + f2.name + " BASLIYOR" + "*****************");
            }
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("======= NEW ROUND ========");
                if (isStart()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
            }
            System.out.println(this.f1.name + " Saglik : " + this.f1.health);
            System.out.println(this.f2.name + " Saglik : " + this.f2.health);
        } else {
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isStart() {
        double randomNumber = Math.random() * 2;
        return randomNumber <= 1;
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandi !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandi !");
            return true;
        }
        return false;
    }
}
