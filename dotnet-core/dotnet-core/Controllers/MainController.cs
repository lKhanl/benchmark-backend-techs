using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

namespace dotnet_core.Controllers
{
    [ApiController]
    [Route("/")]
    public class MainController : ControllerBase
    {
        private readonly ILogger<MainController> _logger;

        public MainController(ILogger<MainController> logger)
        {
            _logger = logger;
        }

        [HttpGet]
        public IActionResult Get()
        {
            double startTime = System.Diagnostics.Stopwatch.GetTimestamp();
            long result = 1;
            for (int i = 1; i < 1000; i++)
            {
                result += i;
            }
            double endTime = System.Diagnostics.Stopwatch.GetTimestamp();
            double time = (endTime - startTime) / 100000;
            return Ok(time);
        }
    }
}
