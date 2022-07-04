package fashionable.simba.yanawa.dto;

import fashionable.simba.yanawa.constant.GenderType;
import fashionable.simba.yanawa.constant.PreferenceType;
import fashionable.simba.yanawa.constant.StatusType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class MatchingDto {

    private final UUID matchingId;
    private final UUID courtId;
    private final LocalDate date;
    private final LocalTime startTime;
    private final LocalTime endTime;
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
    private final UUID hostId;

    public UUID getMatchingId() {
        return matchingId;
    }

    public UUID getCourtId() {
        return courtId;
    }

    public LocalDate getDate() {
        return date;
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

    public UUID getHostId() {
        return hostId;
    }

    public MatchingDto(UUID matchingId, UUID courtId, LocalDate date, LocalTime startTime, LocalTime endTime, Integer annual, Double minimumLevel, Double maximumLevel, Integer ageOfRecruitment, GenderType sexOfRecruitment, PreferenceType preferenceGame, Integer numberOfNumber, Double costOfCourtPerPerson, String details, StatusType status, UUID hostId) {
        this.matchingId = matchingId;
        this.courtId = courtId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.annual = annual;
        this.minimumLevel = minimumLevel;
        this.maximumLevel = maximumLevel;
        this.ageOfRecruitment = ageOfRecruitment;
        this.sexOfRecruitment = sexOfRecruitment;
        this.preferenceGame = preferenceGame;
        this.numberOfNumber = numberOfNumber;
        this.costOfCourtPerPerson = costOfCourtPerPerson;
        this.details = details;
        this.status = status;
        this.hostId = hostId;
    }

    private MatchingDto(MatchingDto.Builder builder) {
        this.matchingId = builder.matchingId;
        this.courtId = builder.courtId;
        this.date = builder.date;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
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
        private UUID courtId;
        private LocalDate date;
        private LocalTime startTime;
        private LocalTime endTime;
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
        private UUID hostId;

        public Builder(UUID matchingId) {
            this.matchingId = matchingId;
        }

        public MatchingDto.Builder courtId(UUID courtId) {
            this.courtId = courtId;
            return this;
        }

        public MatchingDto.Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public MatchingDto.Builder startTime(LocalTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public MatchingDto.Builder endTime(LocalTime endTime) {
            this.endTime = endTime;
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

        public MatchingDto.Builder hostId(UUID hostId) {
            this.hostId = hostId;
            return this;
        }

        public MatchingDto build() {
            return new MatchingDto(this);
        }
    }
}
