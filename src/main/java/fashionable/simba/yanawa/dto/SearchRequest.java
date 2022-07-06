package fashionable.simba.yanawa.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class SearchRequest {
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer annual;

    public SearchRequest(String location, LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, int annual) {
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.annual = annual;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Integer getAnnual() {
        return annual;
    }

    private SearchRequest(Builder builder) {
        this.location = builder.location;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.annual = builder.annual;
    }

    public static class Builder {
        private String location;
        private LocalDate startDate;
        private LocalDate endDate;
        private LocalTime startTime;
        private LocalTime endTime;
        private Integer annual;

        public Builder() {
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder startTime(LocalTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(LocalTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder annual(Integer annual) {
            this.annual = annual;
            return this;
        }

        public SearchRequest build() {
            return new SearchRequest(this);
        }
    }
}
