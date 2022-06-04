package fashionable.simba.yanawa.controller.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class MatchingDto {
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
    private Integer numberOfnumberOf;
    private Double costOfCourtPerPerson;
    private String details;
    private StatusType status;
    private Long hostId;

    private MatchingDto(MatchingDto.Builder builder) {
        this.matchingId           = builder.matchingId;
        this.courtId              = builder.courtId;
        this.startDate            = builder.startDate;
        this.endDate              = builder.endDate;
        this.annual               = builder.annual;
        this.minimumLevel         = builder.minimumLevel;
        this.maximumLevel         = builder.maximumLevel;
        this.ageOfRecruitment     = builder.ageOfRecruitment;
        this.sexOfRecruitment     = builder.sexOfRecruitment;
        this.preferenceGame       = builder.preferenceGame;
        this.numberOfnumberOf     = builder.numberOfnumberOf;
        this.costOfCourtPerPerson = builder.costOfCourtPerPerson;
        this.details              = builder.details;
        this.status               = builder.status;
        this.hostId               = builder.hostId;
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
        private Integer numberOfnumberOf;
        private Double costOfCourtPerPerson;
        private String details;
        private StatusType status;
        private Long hostId;

        public Builder(UUID matchingId){
            this.matchingId = matchingId;
        }
        public MatchingDto.Builder courtId(Long courtId){
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
        public MatchingDto.Builder annula(Integer annual) {
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
        public MatchingDto.Builder numberOfnumberOf(Integer numberOfnumberOf) {
            this.numberOfnumberOf = numberOfnumberOf;
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
    }
}
