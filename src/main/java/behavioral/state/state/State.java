package behavioral.state.state;

import behavioral.state.context.Context;

// 현재상태를 추상화
public interface State {

	public void on(Context context);
	public void off(Context context);

}