public class UserObserver extends Observer {

        public UserObserver(){

        }

        @Override
        public void update(String message) {
            System.out.println( "User notification : "+message );
        }

        @Override
        public void subscribe(StockSubject subject) {
            subject.subscribe(this);
        }

        @Override
        public void unsubscribe(StockSubject subject) {
            subject.unsubscribe(this);
        }

}
