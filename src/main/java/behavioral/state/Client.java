package behavioral.state;

import behavioral.state.context.Context;

public class Client {
	public static void main(String[] args) {
		Context light = new Context();
		light.off();

		light.on();
		light.on();
		light.on();
		light.on();
		light.on();
		light.off();

		light.on();
		light.on();
		light.on();
		light.off();
	}
}