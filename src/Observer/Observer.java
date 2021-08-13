package Observer;

// Observer のインターフェース
interface Observer {
	public abstract void update(Subject subject);
}

// Observer の具象クラス１
class SlackObserver implements Observer {
	@Override
	public void update(Subject subject) {
		System.out.print("Now number is ");
		System.out.print(subject.getNumber());
		System.out.println(" from Slack.");
	}
}

// Observer の具象クラス２
class TwitterObserver implements Observer {
	@Override
	public void update(Subject subject) {
		System.out.print("Now number is ");
		System.out.print(subject.getNumber());
		System.out.println(" from Twitter.");
	}
}