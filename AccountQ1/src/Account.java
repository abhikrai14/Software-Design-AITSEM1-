
	class Account{
		private int number;
		protected int balance;
		private int upperLimit;

        public Account(int n, int b,int l){
        	number=n;
            balance=b;
            upperLimit=l;}
                
        public void withdraw(int amt) throws InsuffFunds{
			if (amt>balance) 
				throw new InsuffFunds();
				//return false;
		    else {   
		    	balance -=amt;   
		    	//return true;
		    	}
		 }
        public void deposit(int amt) throws ExceedsLimit{
			if (amt+balance>upperLimit) 
				throw new ExceedsLimit();
				//return false;
		    else {   
		    	balance +=amt;  
		    	//return true;
		    	}
		 }
		public int read_balance()
		{
			return balance;
		}

	}

