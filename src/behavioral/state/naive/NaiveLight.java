package behavioral.state.naive;

public class NaiveLight {
    // 현재 전원 상태
    // 0 - OFF / 1 - ON / 2 - 초록 / 3 - 노랑 / 4 - 빨강
    private int state = 0;

    public void off(){

        switch (state) {
            case 0:
                System.out.println("반응 없음");
                break;
            case 1:
                System.out.println("Light OFF");
                break;
            case 2:
                System.out.println("초록색에서 OFF");
                break;
            case 3:
                System.out.println("노랑색에서 OFF");
                break;
            case 4:
                System.out.println("빨간색에서 OFF");
                break;
        }

        state = 0;

    }

    public void on(){

        if(state == 0) {
            System.out.println("Light On");
            state = 1;
        }

        else if(state == 1) {
            System.out.println("경고 : 초록");
            state = 2;
        }

        else if(state == 2){
            System.out.println("경고 : 노랑");
            state = 3;
        }

        else if(state == 3){
            System.out.println("경고 : 빨강");
            state = 4;
        }

        else if(state == 4){
            System.out.println("과부하로 인해 꺼짐");
            state = 0;
        }


    }



}
