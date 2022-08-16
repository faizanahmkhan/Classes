public class Account {

        public String id;
        public String name;
        public int balance;

        public Account (String newId, String newName, int newBalance) {
                this.id = newId;
                this.name = newName;
                this.balance = newBalance;
        }

        public String getId() {
                return this.id;
        }

        public String getName() {
                return this.name;
        }

        public int getBalance() {
                return this.balance;
        }

        public void setId(String id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setBalance(int balance) {
                this.balance = balance;
        }
        @Override
        public String toString() {
                return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
        }

    }

