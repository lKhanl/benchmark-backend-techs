using System;
using dotnet_core.Responses;

namespace dotnet_core.Mapper
{
    public class MainMapper
    {
       public static MainResponse toResponse(double result, String tech, double time)
        {
            MainResponse response = new MainResponse();

            response.result = result;
            response.tech = tech;
            response.time = time;

            return response;
        } 
    }
}
