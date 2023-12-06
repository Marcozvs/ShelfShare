package shelfshare.Services;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.AssessmentModel;
import shelfshare.Repositories.AssessmentRepository;

public class AssessmentService {
    private final AssessmentRepository assessmentRepository;

    public AssessmentService() {
        this.assessmentRepository = new AssessmentRepository();
    }

    public boolean addAssessment(AssessmentModel assessmentModel) {
        return assessmentRepository.addAssessment(assessmentModel);
    }
    
    public float getMediaReviewBook(UUID idLivro) {
        return assessmentRepository.getMediaReviewBook(idLivro);
    }
}
