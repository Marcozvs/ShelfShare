package shelfshare.Controllers;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.AssessmentModel;
import shelfshare.Services.AssessmentService;

public class AssessmentController {
    private final AssessmentService assessmentService;

    public AssessmentController() {
        this.assessmentService = new AssessmentService();
    }

    public boolean addAssessment(AssessmentModel assessmentModel) {
        return assessmentService.addAssessment(assessmentModel);
    }
    
    public float getMediaReviewBook(UUID idLivro) {
        return assessmentService.getMediaReviewBook(idLivro);
    }
}
