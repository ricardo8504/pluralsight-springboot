package schultz.dustin.io.justgifit.controller;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.invoke.MethodHandles;


@RestController
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup());

    @Value("multipart.location")
    private String location;

    @RequestMapping(value="/upload",method= RequestMethod.POST,produces = MediaType.IMAGE_GIF_VALUE)
    public String upload(RequestPart("file") MultipartFile file,
                        RequestParam("start") int start,
                        RequestParam("end") int end,
                        RequestParam("speed") int speed,
                        RequestParam("repeat") boolean repeat

        return "";
    }


}
