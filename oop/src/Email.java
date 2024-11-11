import java.time.LocalDate;

public class Email {
    private Integer id;
    private String topic;
    private String description;
    private LocalDate sentDate;
    public Email(){};
    public Email(Integer id, String topic, String description, LocalDate sentDate) {
        this.id = id;
        this.topic = topic;
        this.description = description;
        this.sentDate = sentDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDate sentDate) {
        this.sentDate = sentDate;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", description='" + description + '\'' +
                ", sentDate=" + sentDate +
                '}';
    }
}
