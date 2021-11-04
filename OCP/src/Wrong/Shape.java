package Wrong;

public abstract class Shape {
    int m_type;
    public Shape(int m_type)
    {
        this.m_type=m_type;
    }

    public int getType() {
        return m_type;
    }
}
