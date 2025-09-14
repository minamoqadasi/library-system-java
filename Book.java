class Book {

  private String name;
  private String author;
  private int id;
  private int quantity; // number of copies the library has

  // Constructor
  public Book(String name, String author, int id, int quantity){
        this.name = name;
        this.author = author;
        this.id = id;
        this.quantity = quantity;
  }

  // Getters/Setters
  public String getName(){
    return name;
  }

  public String getAuthor(){
    return author;
  }

  public int getId(){
    return id;
  }

  public int getQuantity(){
        return quantity;
  }

  public void setQuantity(int quantity){
        this.quantity = quantity;
  }

  // equals method (@override)
  // toString method (@override)
  @Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}

		if(o == this) {
			return true;
		}

		if(!(o instanceof Book) && !(this instanceof Book)) {
			return false;
		}

		Book b = (Book) o;
		return this.id == b.id;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Author: " + author + " id: " + id + " Quantity: " + quantity;
	}

}
