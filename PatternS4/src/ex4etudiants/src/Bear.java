package ex4etudiants.src;
public class Bear {
	private State state;
	private enum State{
		NOTSLEEPING{
			@Override
			public void attack() {
				System.out.println("GroaaR");	
			}
			
			@Override
			public void wakeup(Bear b) {
				throw new RuntimeException("already not sleeping");	
			}
		},SLEEPING{
			@Override
			public void attack() {
				System.out.println("Zzzzzz");
			}

			@Override
			public void sleep(Bear b) {
				throw new RuntimeException("already sleeping");
			}
		};
		void attack() {
		}

		void wakeup(Bear b) {
			b.setState(State.NOTSLEEPING);
		}

		public void sleep(Bear b) {
			b.setState(State.SLEEPING);
		}
	}
	public Bear() {
		setState(State.NOTSLEEPING);
	}
	public void attack() {
		state.attack();
	}
	
	public void sleep() {
		state.sleep(this);
	}
	
	public void wakeup() {
		state.wakeup(this); 
	}
	
	private void setState(State state) {
		this.state= state;
	}
	
	public static void main(String[] args) {
		Bear b= new Bear();
		b.attack();
		b.sleep();
		b.attack();
	}
}
