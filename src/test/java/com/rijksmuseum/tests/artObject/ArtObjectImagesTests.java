package com.rijksmuseum.tests.artObject;

import com.rijksmuseum.tests.AbstractTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import com.rijksmuseum.tests.model.artObject.LevelsItem;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static com.rijksmuseum.tests.Behaviors.ART_OBJECT_IMAGES;

@Epic(ART_OBJECT_IMAGES)
@Feature("Get an Art Object images")
public class ArtObjectImagesTests extends AbstractTest {

    @Test(description = "TC#01 Verifying that the images list is not empty")
    public void checkArtObjectImagesListNotEmpty() {
        List<LevelsItem> actualResult = step.images.getArtObjectImages(data.details.getDefaultArtObject());
        step.generic.assertGreaterSize(actualResult.size(), 0);
    }

    //TODO: add tests to verify tiles, for example for incorrect Art Object numbers should be 404, not 500
}
