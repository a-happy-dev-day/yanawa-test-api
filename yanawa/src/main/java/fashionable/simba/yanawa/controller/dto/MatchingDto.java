package fashionable.simba.yanawa.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fashionable.simba.yanawa.domain.GenderType;
import fashionable.simba.yanawa.domain.PreferenceType;
import fashionable.simba.yanawa.domain.StatusType;

import java.time.LocalDateTime;
import java.util.UUID;

public class MatchingDto {

    private final UUID matchingId;
    private final Long courtId;
    @JsonIgnore
    private final LocalDateTime startDate;
    @JsonIgnore
    private final LocalDateTime endDate;
    private final Integer annual;
    private final Double minimumLevel;
    private final Double maximumLevel;
    private final Integer ageOfRecruitment;
    private final GenderType sexOfRecruitment;
    private final PreferenceType preferenceGame;
    private final Integer numberOfNumber;
    private final Double costOfCourtPerPerson;
    private final String details;
    private final StatusType status;
    private final Long hostId;

    public UUID getMatchingId() {
        return matchingId;
    }

    public Long getCourtId() {
        return courtId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Integer getAnnual() {
        return annual;
    }

    public Double getMinimumLevel() {
        return minimumLevel;
    }

    public Double getMaximumLevel() {
        return maximumLevel;
    }

    public Integer getAgeOfRecruitment() {
        return ageOfRecruitment;
    }

    public GenderType getSexOfRecruitment() {
        return sexOfRecruitment;
    }

    public PreferenceType getPreferenceGame() {
        return preferenceGame;
    }

    public Integer getNumberOfNumber() {
        return numberOfNumber;
    }

    public Double getCostOfCourtPerPerson() {
        return costOfCourtPerPerson;
    }

    public String getDetails() {
        return details;
    }

    public StatusType getStatus() {
        return status;
    }

    public Long getHostId() {
        return hostId;
    }

    private MatchingDto(MatchingDto.Builder builder) {
        this.matchingId = builder.matchingId;
        this.courtId = builder.courtId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.annual = builder.annual;
        this.minimumLevel = builder.minimumLevel;
        this.maximumLevel = builder.maximumLevel;
        this.ageOfRecruitment = builder.ageOfRecruitment;
        this.sexOfRecruitment = builder.sexOfRecruitment;
        this.preferenceGame = builder.preferenceGame;
        this.numberOfNumber = builder.numberOfNumber;
        this.costOfCourtPerPerson = builder.costOfCourtPerPerson;
        this.details = builder.details;
        this.status = builder.status;
        this.hostId = builder.hostId;
    }

    public static class Builder {
        private final UUID matchingId;
        private Long courtId;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Integer annual;
        private Double minimumLevel;
        private Double maximumLevel;
        private Integer ageOfRecruitment;
        private GenderType sexOfRecruitment;
        private PreferenceType preferenceGame;
        private Integer numberOfNumber;
        private Double costOfCourtPerPerson;
        private String details;
        private StatusType status;
        private Long hostId;

        public Builder(UUID matchingId) {
            this.matchingId = matchingId;
        }

        public MatchingDto.Builder courtId(Long courtId) {
            this.courtId = courtId;
            return this;
        }

        public MatchingDto.Builder startDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public MatchingDto.Builder endDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public MatchingDto.Builder annual(Integer annual) {
            this.annual = annual;
            return this;
        }

        public MatchingDto.Builder minimumLevel(Double minimumLevel) {
            this.minimumLevel = minimumLevel;
            return this;
        }

        public MatchingDto.Builder maximumLevel(Double maximumLevel) {
            this.maximumLevel = maximumLevel;
            return this;
        }

        public MatchingDto.Builder ageOfRecruitment(Integer ageOfRecruitment) {
            this.ageOfRecruitment = ageOfRecruitment;
            return this;
        }

        public MatchingDto.Builder sexOfRecruitment(GenderType sexOfRecruitment) {
            this.sexOfRecruitment = sexOfRecruitment;
            return this;
        }

        public MatchingDto.Builder preferenceGame(PreferenceType preferenceGame) {
            this.preferenceGame = preferenceGame;
            return this;
        }

        public MatchingDto.Builder numberOfNumber(Integer numberOfNumber) {
            this.numberOfNumber = numberOfNumber;
            return this;
        }

        public MatchingDto.Builder costOfCourtPerPerson(Double costOfCourtPerPerson) {
            this.costOfCourtPerPerson = costOfCourtPerPerson;
            return this;
        }

        public MatchingDto.Builder details(String details) {
            this.details = details;
            return this;
        }

        public MatchingDto.Builder status(StatusType status) {
            this.status = status;
            return this;
        }

        public MatchingDto.Builder hostId(Long hostId) {
            this.hostId = hostId;
            return this;
        }

        public MatchingDto build() {
            return new MatchingDto(this);
        }
    }
}
