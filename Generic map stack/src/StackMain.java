
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> si = new Stack<Integer>(5);// 타입이 int임
		//위에가 사이즈 정하는거 [size]를 소괄호에서 정함 5개라고
		//v = (T[])new Object[size]; = t 배열 v가 5개라는 거
		//그리고 계속 푸쉬해서 0,1,2,3,4를 넣음
		//v[count++] = o;
		//그리고 마지막 값을 리턴했을 때 하나를 빼고 값을 나타내라고 함
		//return v[--count];
		//그래서 3이 나온 거임
   		
		si.push(10); //첫번째
		si.push(100); //두번째
		si.push(1000); //세번째
		
		System.out.println(si.size());//모르겠음
		int ret = si.pop();
		System.out.println(ret); //위에 si.push 가장 마지막에 들어간 것부터 나옴
		ret = si.pop();
		System.out.println(ret); 
		ret = si.pop();
		System.out.println(ret); //가장 처음에 들어간 것이 나옴
		//계속 pop을 줘서 그럼 pop이 빼내는 거니까 한 번 할 때 마다 빼내서 위처럼 되는 거임
		
		IStack<Character> sc = new Stack<Character>(5); 
		sc.push('c');// char형 타입 스택에 문자c가 들어감
		char ch = sc.pop(); //char 형 변수 ch에 스택에서 뺀 값을 대입함
		System.out.println(ch); //대입 했기에 ch의 값이 나온거임
		
		Point p1 = new Point(10, 20); //(x,y)값이 10,20
		IStack<Point> sp = new Stack<Point>(5);
		sp.push(p1);//10, 20이 한번에 들어감 
		Point p = sp.pop();
		System.out.printf("%d, %d\n", p.getX(), p.getY());//위랑 똑같지만 정수임
	
		IStack<Integer> si2 = new Stack<Integer>(5);
		si2.push(20);
		
		System.out.printf("si = %d, si2 = %d\n", si.size(), si2.size());//스택 안에 들어간 숫자 개수를 이야기함
		// si는 위에 10,100,1000이니까 3이 나오고 si2는 20 하나니까 1이 나옴
		boolean b = si.compareSize(si2);
		//si가 si2보다 큰 값을 가지고 있다면 true si2의 개수가 많으면 지금 si는 3이니까 4이면 false값이 나옴
		System.out.println(b);
		System.out.printf("si = %d, sp = %d\n", si.size(), sp.size());
		b = si.compareSize(sp);
		System.out.println(b);
	}

}
