package com.guige.account.controller;

import com.guige.account.pojo.entity.Module;
import com.guige.account.pojo.entity.RoleMod;
import com.guige.account.pojo.vo.ModuleVo;
import com.guige.account.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Anwei.S 
 * @CreateDate 2017年2月14日 上午10:27:46
 * @Description:对外提供的接口
 */
@RestController
@RequestMapping(value = "/v1/modules")
@SuppressWarnings("all")
public class ModuleController {
	@Autowired
	ModuleService moduleService;

	@RequestMapping(method = RequestMethod.POST)
	public Module createModule(@RequestBody ModuleVo module) {

		return moduleService.createModule(module);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Integer updateModule(@RequestBody ModuleVo module) {
		return moduleService.updateModule(module);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public Integer deleteModule(@RequestParam("moduleUuids[]") List<String> moduleUuids) {
		return moduleService.deleteModule(moduleUuids);
	}

	@RequestMapping(value = "/modulesByRole", method = RequestMethod.GET)
	public List<Module> findModulesByRole(@RequestParam("roleUuid") String roleUuid) {
		return moduleService.findModules(null, null, roleUuid);
	}

	@RequestMapping(value = "/modulesByComp", method = RequestMethod.GET)
	public List<Module> findModulesByComp(@RequestParam("compUuid") String compUuid) {

		return moduleService.findModules(compUuid, null, null);
	}

	@RequestMapping(value = "/modulesByUser", method = RequestMethod.GET)
	public List<RoleMod> findModulesByUser(@RequestParam("compUuid") String compUuid,
										   @RequestParam("userUuid") String userUuid) {
		return moduleService.findModules(compUuid, userUuid);
	}
	@RequestMapping(value = "/modulesAllByUser", method = RequestMethod.GET)
	public List<Module> findModulesAllByUser(@RequestParam("compUuid") String compUuid,
			@RequestParam("userUuid") String userUuid) {
		return moduleService.findModulesAllByUser(compUuid, userUuid);
	}
	@RequestMapping(value = "/modulesAllByComp", method = RequestMethod.GET)
	public List<Module> findModulesAllByComp(@RequestParam("compUuid") String compUuid) {

		return moduleService.findModulesAllByComp(compUuid);
	}
	@RequestMapping(value = "/modulesUrl", method = RequestMethod.GET)
	public Map<String,String> findModules() {

		return moduleService.findModulesUrl();
	}
}
